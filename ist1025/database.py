import sqlite3 as sl

conn = sl.connect('database.db')

print("connected to database")

conn.execute('''
             CREATE TABLE users (
             id INTEGER PRIMARY KEY AUTOINCREMENT,
             name TEXT,
             age INTEGER
             );
             ''')

sql = 'INSERT INTO users (id, name, age) values(?, ?)'

data = [
    (1, 'Alice', 25),
    (2, 'Bob', 30),
    (3, 'Chris', 23)
]

with conn:
    conn.executemany(sql, data)

data = conn.execute('SELECT * FROM users WHERE age >= 22')

for row in data:
    print(row)