import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root",
)

mycursor = mydb.cursor()
mycursor.execute("CREATE DATABASE IF NOT EXISTS mydatabase")
#mycursor.execute("SHOW DATABASES")


mycursor.execute("CREATE TABLE IF NOT EXISTS mydatabase.users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)")
#mycursor.execute("SHOW TABLES")
data = [
    ('Alice', 25),
    ('Bob', 30),
    ('Chris', 23),
    ('John', 28),
    ('Jane', 22),
    ('Doe', 35),
    ('Eve', 29),
    ('Frank', 31),
    ('Grace', 27),
    ('Heidi', 24),
    ('Ivan', 26),
    ('Judy', 32),
    ('Mallory', 33),
    ('Niaj', 34),
    ('Olivia', 36),
    ('Peggy', 37),
    ('Rupert', 38),
]
mycursor.executemany("INSERT INTO mydatabase.users (name, age) VALUES (%s, %s)", data)
mydb.commit()
mycursor.execute("SELECT * FROM mydatabase.users")
results = mycursor.fetchall()
for row in results:
    print(row)