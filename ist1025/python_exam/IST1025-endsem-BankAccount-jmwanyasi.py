class BankAccount:
    """
    This is a banking system that alows customers to manage their accounts
    by making deposits
    """

    def __init__(self, account_number, balance=0):
        self.account_number = account_number 
        self.balance = balance 

    #deposit method
    def deposit(self, amount):
        """
        depositing money to account
        """
        if amount > 0:
            self.balance += amount
            print(f"depositing {amount}")
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
                print(f"withdrawing {amount}")
            else:
                print("you do not have sufficient funds")
        else:
            print("you have insufficient funds")


    def get_balance():
        """
        shows balance
        """
        return self.balance


account = BankAccount(123456789)
account.deposit(2300)

account.withdraw(244)

print(f"your balance is {account.get_balance}")


