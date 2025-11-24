from random import randrange as r#importing random module to generate a random number using randrange as 'r'
class GuessingGame:#GuessingGame class to hold code related to build number game
    global chances#to hold how many chances to be given for the user to guess a number
    chances=3
    def generate_random_number(self):
        """
        Parameters:
        self:an initial parameter that should be present in any method or constructor inside a class.
        raises:
            ValueError:when user inputs invalid inputs like strings.
            """
        random_number=r(1,101)#generates a random number between 1 and 101
        self.random_number=random_number
    def guess_evaluation(self,guessed_number:int):
        """
        Parameters:
        self:an initial parameter that should be present in any method or constructor inside a class.
        guessed_number(int):used to store the value guessed by the user.
        raises:
            ValueError:when user inputs invalid inputs like strings."""
        self.guessed_number=guessed_number
        if self.guessed_number>0 and self.guessed_number<101:#checks whether the guessed_number is within 1 and 101
            if self.guessed_number==self.random_number:#prints the below statement when guessed_number is equal to random_number
                print("congrats! your guess is absolutely right")
                return True
            if self.guessed_number>self.random_number:#prints the below statement when guessed_number is greater than to random_number
                if chances!=0:
                    print("too high, you can try again")
                   
                else:
                    print("\ttoo high",end=" ")
                    print("you lost",end=" ")
                    print("the correct answer is: ",self.random_number)
                    
            elif self.guessed_number<self.random_number:#prints the below statement when guessed_number is lesser than to random_number
                if chances!=0:
                    print("\ttoo low, you can try again")
                   
                else:
                    print("\ttoo low",end=" ")
                    print("you lost",end=" ")
                    print("the correct answer is: ",self.random_number)
                    
        else:#prints the below ststement when the user not enter values that are in the range of  between 1 and 101
            print("\tplease enter a number between 1 and 101")
print("\t  +------------------------+")
print("\t  |       GUESSING GAME    |")
print("\t  +------------------------+")           
obj=GuessingGame()#creating Object For the class GuessingGame() named obj
obj.generate_random_number()#calling generate_random_number() function
while chances>0:#using while loop to make the user to have three chances to guess the number
    try:#contains code that leads to an error
        guessed_number=int(input("Enter a number that you have guessed :"))
        chances=chances-1
        if obj.guess_evaluation(guessed_number):
            break
        print("you have", chances ,"chances left")
    except ValueError:#catches the ValueError and handles it
        print("\tInvalid Input please Enter only Integer values")
        print("you have ",chances,"chances left")