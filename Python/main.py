from account import Account
from car import Car
if __name__ == '__main__':
    print("Hola mundo")
    
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    
    # car = Car()
    # car.license = "AMS234"
    # car.driver = "Andres Herrera"
    # print(vars(car))
    
    # car2 = Car()
    # car2.license = "QWE567"
    # car2.driver = "Martha"
    # print(vars(car2))