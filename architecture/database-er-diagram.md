# Database Schema

The system uses MySQL as the primary relational database.

## Tables

users
expenses
expense_participants
balances
notifications
spending_summary

## Table Relationships

users → expenses (creator)

expenses → expense_participants

expense_participants → users

balances → users
