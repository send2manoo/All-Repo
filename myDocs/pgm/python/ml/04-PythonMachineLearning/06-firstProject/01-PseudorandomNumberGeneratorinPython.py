'''
The pseudorandom number generator can be seeded by calling the random.seed() function. Random floating point values between 0 and 1 can be generated by calling the random.random() function
'''
# demonstrates the python pseudorandom number generator
from random import seed
from random import random
# seed the generator
seed(7)
for _ in range(5):
	print(random())
# seed the generator to get the same sequence
print('Reseeded')
seed(7)
for _ in range(5):
	print(random())

