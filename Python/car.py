from account import Account
class Car:
    id = int
    driver = str
    license = Account("", "")
    passegenger = int
    
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
    