class Complex:
    real = 0.0
    imag = 0.0
    def enter(self):
        self.real = float(input("Enter Real Part of Number "))
        self.imag = float(input("Enter imaginary Part of Number "))

x = Complex()
x.enter()

y = Complex()
y.enter()

z = Complex()
z.real = x.real + y.real
z.imag = x.imag + y.imag

if(z.imag >= 0):
    print("Sum of Two Complex Number is : ",z.real,"+",z.imag,"i")

else:
    print("Sum of Two Complex Number is : ",z.real, z.imag,"i")

