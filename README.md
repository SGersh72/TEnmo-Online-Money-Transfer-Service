**Please Note: this capstone team project is displayed only for the purpose of the interview process at Tech Elevator**

# Capstone - TEnmo

TEnmo is an online payment transfer application using a RESTful API server and a PostgreSQL database.

## Use cases

Registration and Login 
The cAuthentication and Registration code was provided to us in the starter code
1. A user registers with a username and password and gets an initial balance of a 1000 TE money
2. A user logs in using the registered username and password, and gets an authentication token that is included in all future activity

User Accounts
1. An authenticated user may open multiple accounts 
2. The user can view a list of their accouts and balances
3. The user can select an account to view further details of that account, such as transfers and their details (Transfer ID, Account From, 
   Account To, Transfer Type: SEND or REQUEST and Transfer Status: APPROVED, PENDING or REJECTED 

Transfer Types
A. ****SEND- Transfer money to another user
1. The user can transfer an amount of money (greater than zero) to another registered user (but not to oneself) by selecting the recepient 
   from a user list, and selecting the target account of that user (assuming multiple accounts per user)
2. Transfer details include User IDs of sender and recepient and the amount, a status and a type SEND or REQUEST
3.  a. If the sender has the sufficient funds in the sending account, the transfer status is automatically set to APPROVED, and the transfer 
       is conducted.
    b. If the sender account does not have sufficient funds, the transfer status is set to PENDING
4. An APPROVED transfer results in balance updates to recepient account and sender account

B. ****REQUEST - Request a money transfer from another user
1. An authenticated user can request a money transfer of a specific amount from another user, selecting that user and the accounts from 
   which and to which money is transfered (users may have multiple accounts) 
2. The transfer status of any request is PENDING until APPROVED by the other user

Transfer Status
A. APPROVED status is automatically issued to:
   1. A SEND transfer in which the sender has sufficient funds in their account
   2. A PENDING REQUEST transfer, by the user who will be sending money (if their accout has sufficient funds).
B. PENDING status is automatically issued to:
   1. all REQUEST transfers until APPROVED or REJECTED
   2. all SEND transfers if the sending account lacks sufficient funds
C. REJECTED status can issued by a user for a money transfer request from them.

Viewing and Managing Transfers
1. All transfers made appear in the accounts of both sender and receiver (Account From and Account To)
2. An authenticated user can search for a all transfers by: an Account Id, Transfer Id, or User Id
3. An authorized user can manage the status of their PENDING transfers to either APPROVED or REJECTED
