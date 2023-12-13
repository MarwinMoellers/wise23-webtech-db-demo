/// <reference types="cypress" />

// Welcome to Cypress!
//
// This spec file contains a variety of sample tests
// for a todo list app that are designed to demonstrate
// the power of writing tests in Cypress.
//
// To learn more about how Cypress works and
// what makes it such an awesome testing tool,
// please read our getting started guide:
// https://on.cypress.io/introduction-to-cypress

describe('general pizza flow', () => {
  beforeEach(() => {
    // Cypress starts out with a blank slate for each test
    // so we must tell it to visit our website with the `cy.visit()` command.
    // Since we want to visit the same URL at the start of all our tests,
    // we include it in our beforeEach function so that it runs before each test
    cy.request("DELETE", "http://localhost:8080/api/pizza")
    cy.visit('http://localhost:5173/')
  })

  it('should create new pizza and show in table', () => {
    cy.get('label').should('contain.text', 'Name:')
    // cy.get('.todo-list li').should('have.length', 2)
    cy.get('[data-cy="overview-button"]').click()
    let pizzaName = 'New Pizza';
    cy.get('input').type(pizzaName)
    cy.get('button').click()
    cy.get('table > :nth-child(2) > :nth-child(2)').should("contain.text", pizzaName)
  })
})
