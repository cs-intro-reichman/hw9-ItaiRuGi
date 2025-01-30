public class LinkedPrivTest {
    public static void main(String args[]){
        LinkedList test1 = new LinkedList();
       // System.out.println(test1);
        MemoryBlock alsotest = new MemoryBlock(30, 1);
        test1.add(0, alsotest);
        MemoryBlock alsotest1 = new MemoryBlock(200, 2);
        MemoryBlock alsotest2 = new MemoryBlock(23, 6);
        MemoryBlock alsotest3 = new MemoryBlock(2230, 1);
        MemoryBlock alsotest4 = new MemoryBlock(95, 34);
        MemoryBlock alsotest5 = new MemoryBlock(91, 71);
        MemoryBlock alsotest6= new MemoryBlock(1, 19);
        test1.add(1, alsotest1);
        MemorySpace attempt = new MemorySpace(10);
        System.out.println(attempt);
        attempt.malloc(3);
        System.out.println(attempt);
        attempt.malloc(2);
        System.out.println(attempt);
        attempt.malloc(4);
        System.out.println(attempt);
        //System.out.println(test1);
        test1.add(0, alsotest2);
       // System.out.println(test1);
        test1.addLast(alsotest3);
       // System.out.println(test1);
        test1.addFirst(alsotest4);
       
    }
}
