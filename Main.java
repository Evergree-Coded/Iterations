class Main {
  public static void main(String[] args) {

    int a = 5; 
    int i = 20; 
    for(i = 1; i < a; i++){
      System.out.print(i + " ");
    }     
    System.out.println();
    System.out.println(a); 
    System.out.println(i); 
    //outputs: 1 2 3 4 

    System.out.println(); 
    
    //Task1 : 
    // outputs: 20 19 18 17 16 15 
    // Hint: i--, will subtract 1
    for(i = 20; i > 14; i--){
      System.out.print(i + " "); 
    } 
  }
}