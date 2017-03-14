// You are given a class Solution with a main method. 
// Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. 
// You should read the variables from the standard input.

static Scanner var= new Scanner(System.in);
static int B= var.nextInt();
static int H= var.nextInt();
static boolean flag=true;

static{
    try{
        if(B<=0|| H<=0){
            flag=false;
            throw new Exception("Breadth and height must be positive");
        }
    }
    catch (Exception e){
        System.out.println(e);
    }
}