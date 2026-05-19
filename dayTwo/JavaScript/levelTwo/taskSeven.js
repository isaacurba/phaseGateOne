const prompt = require("prompt-sync")();

password = "admin123"

user_password = prompt("Enter your password: ")

if (user_password != password)console.log("Password is incorrect.")
else console.log("password is correct.")
