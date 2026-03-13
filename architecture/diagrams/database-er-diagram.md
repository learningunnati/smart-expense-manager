## Database ER Diagram

```
                users
                  |
                  | (1 : N)
                  v
               expenses
                  |
                  | (1 : N)
                  v
        expense_participants
                  |
                  | (N : 1)
                  v
                users


               expenses
                  |
                  v
               balances


                users
                  |
                  v
            notifications
```

### Database Relationships

- A **user** can create multiple **expenses**.
- Each **expense** can have multiple **expense participants**.
- Expense participants reference **users** involved in the expense.
- **Balances** track the settlement information between users.
- **Notifications** store system notifications for users.

