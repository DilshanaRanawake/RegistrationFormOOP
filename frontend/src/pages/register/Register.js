import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import axios from 'axios';
import './Register.css';

const Register = () => {
  const [validated, setValidated] = useState(false);
  const [formData, setFormData] = useState({
    email: '',
    name: '',
    contactNo: '',
  });
  const [submissionStatus, setSubmissionStatus] = useState('');

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (event) => {
    const form = event.currentTarget;
    if (form.checkValidity() === false) {
      event.preventDefault();
      event.stopPropagation();
    } else {
      event.preventDefault();
      axios.post('http://localhost:9000/auth/register', formData)
        .then(response => {
          setSubmissionStatus('You are registered successfully with the email of ' + formData.email);
        })
        .catch(error => {
          setSubmissionStatus('Error: ' + error.message);
        });
    }
    setValidated(true);
  };

  return (
    <div className="form-container">
      <Form noValidate validated={validated} onSubmit={handleSubmit} className="register-form">
        <Form.Group controlId="formEmail">
          <Form.Label>Email</Form.Label>
          <Form.Control
            required
            type="email"
            placeholder="Email"
            name="email"
            value={formData.email}
            onChange={handleChange}
          />
          <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
        </Form.Group>
        <Form.Group controlId="formName">
          <Form.Label>Name</Form.Label>
          <Form.Control
            required
            type="text"
            placeholder="Name"
            name="name"
            value={formData.name}
            onChange={handleChange}
          />
          <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
        </Form.Group>
        <Form.Group controlId="formContactNo">
          <Form.Label>Contact Number</Form.Label>
          <Form.Control
            required
            type="text"
            placeholder="Contact Number"
            name="contactNo"
            value={formData.contactNo}
            onChange={handleChange}
          />
          <Form.Control.Feedback type="invalid">
            Please provide a valid contact number.
          </Form.Control.Feedback>
        </Form.Group>
        {submissionStatus && <p className="submission-status">{submissionStatus}</p>}
        <Button type="submit" className="submit-button">Submit form</Button>
      </Form>
    </div>
  );
};

export default Register;
