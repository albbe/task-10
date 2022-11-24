// uppg 10

     
     // uppg 10.4 These methods should do exactly the same thing as the ones in Exercise 3, but using recursion instead of iteration. 
     //There are several strategies that you may use here. You may also create private helper methods if required. 
    //  Finally, there are some useful methods in java.util.Arrays and java.util.ArrayList that may help depending on your strategy.

     //Vet varför det blir stack overflo här, numbers.length är alltid större än 0 men fattar inte hur jag ska lösa. Metodnamnet får man inte ändra på. 

        public int sumRecursive(int[] numbers){
        int sum;
        int n; 
        if (0 >= numbers.length){
            return numbers[0];
        }
            else {
                n = 0;
                sum =+ numbers[n];
                n =+ 1;
                return sum + sumRecursive(numbers);
            }
        }



        //tänkte om jag ska göra en hjälpmetod
        
        private int helpSumRecursive(int [] numbers){
            return sumRecursive (numbers, n-1)
        }
        
        
        
        
        // uppg 10.7
        // These methods should return a shuffled list of numbers, by randomly swapping elements to randomise the ordering.
        // Assistant's requirement: You are not allowed to use Collections.shuffle(), and the argument list should not be mutated. That is to say, you must make a local copy of the argument.
        //Metod för att shuffla en array. Får inte ändra metodnamn. Funderar däremot på om man ska skapa lokal kopia av array
        
        public int[] shuffled(int[] numbers){
        Random random = new Random();
        int n = random.nextInt(0); // tanken här är att generera ett random nummer och att detta nummer motsvarar det index-värde som hämtas från numebers arrayen
        int [] shuffled = new int[n];
        int x = (int) Array.get(numbers, n); // och sen hämta indexet i rad 44
        for(int i = 0; i < numbers.length; i++){
        shuffled [i] = x;
        numbers.remove(n);
        }
    }
