#!/usr/bin/python

"""
this code demonstrates OOP concepts
inheritance, encupsulation and hiding
"""

class BankAccount:
    """
    banking system
    """

    #constructor method
    def __init__(self, account_holder, balance):
        self.account_holder = account_holder #public attribute
        self.__balance = balance #private attribute showing encupsulation

    #deposit method
    
    def deposit(self, amount):
        """
        depositing money to account
        """
        if amount > 0:
            self.__balance += amount
            print(f"Deposited amount is {amount}, new balance {self.__balance}")
        else:
            print("Deposit must be positive")

    #withdraw method
    def withdraw(self, amount):
        """
        withdrawing money from account
        """
        if amount > 0:
            if amount <= self.__balance:
                self.__balance -= amount
                print(f"you withdrew {amount}, your balance is {self.__balance}")
            else:
                print("you do not have sufficient funds to withdraw {amount}, your balance is {self.__balance}")
        else:
            print("you have insufficient funds")


    def get_balance(self):
        """
        shows balance
        """
        return self.__balance
#end of parent class
#now we create child class
class SavingsAccount(BankAccount):
    """
    child of bank account
    """

    #child constructor
    def __init__(self, account_holder, balance, interest_rate):
        super().__init__(account_holder, balance) #calling the parent construtor
        self.interest_rate = interest_rate #public attribute


    def apply_interest(self):
        """
        applys interest to the balance
        """
        interest = self.get_balance() * self.interest_rate/100
        self.deposit(interest)
        print(f"interest of {interest} applied. New Balance:{self.get_balance()}")

#child class checking acount
class CheckingAccount(BankAccount):
    """
    checking account
    """

    #constructor
    def __init__(self, account_holder, balance, overdraft_limit):
        super().__init__(account_holder, balance)
        self.overdraft_limit = overdraft_limit


    def withdraw(self, amount):
        """
        allowing overdraft
        """
        if amount <= (self.get_balance() + self.overdraft_limit):
            self.deposit(-amount)
            print(f"overdraft allowed, {amount} withdrawn from your account, your balance is {self.get_balance()}")
        else:
            print("withdrawal exceeds overdraft")

savings = SavingsAccount('John', 1000, 5) #account holder, balance, interest rate
checking = CheckingAccount('John', 500, 200) #500 balance and 200 overdraft limit

savings.deposit(500)
savings.apply_interest()

checking.withdraw(900)#not allowed because it exceeds limit
checking.withdraw(600)#allowed
