class Car:
    def __init__(self, manufacture, model, make, transmission, color):
        self.manufacture = manufacture
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacture} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacture} {self.model} has stopped")


car1 = Car("Toyota", "Corolla", "Sedan", "Automatic", "White")
car2 = Car("Honda", "Civic", "Sedan", "Manual", "Black")
car3 = Car("Tesla", "Model 3", "Electric", "Automatic", "Red")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
