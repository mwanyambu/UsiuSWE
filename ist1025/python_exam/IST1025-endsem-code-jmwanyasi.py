def calculate_salary(hourly_rate, hours_worked, tax_rate=0.15):
    """
    this function computes gross salary
    then computes deductions
    and then returns net salary after tax
    """

    gross_salary = hourly_rate * hours_worked
    deductions = gross_salary * tax_rate
    net_salary = gross_salary - deductions

    print(f"net salary after deductions is {net_salary}")
    
hourly_rate = float(input("whats your hourly_rate? "))
hours_worked = float(input("whats your total hours? "))

calculate_salary(hourly_rate, hours_worked)



        
            
        
