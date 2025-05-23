class BankAccount:
    """
    This is a banking system that alows customers to manage their accounts
    by making deposits
    """

    def __init__(self, account_number, balance=0):
        self.account_holder = account_holder 
        self.balance = balance 

    #deposit method
    def deposit(self, amount):
        """
        depositing money to account
        """
        if amount > 0:
            self.balance += amount
        else:
            print("Deposit must be positive")

    #withdraw method
    def withdraw(self, amount):
        """
        withdrawing money from account
        """
        if amount > 0:
            if amount <= self.balance:
                self.balance -= amount
            else:
                print("you do not have sufficient funds to withdraw {amount}, your balance is {self.__balance}")
        else:
            print("you have insufficient funds")


    def get_balance(self):
        """
        shows balance
        """
        return self.balance



BankAccount.deposit(2300)
BankAccount.withdraw(6000)

