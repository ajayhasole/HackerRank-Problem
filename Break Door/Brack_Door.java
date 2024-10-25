import java.util.*;

class Brack_Door{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of hammers
        int d = scanner.nextInt(); // Strength of the door
        int k = scanner.nextInt(); // Number of trials
        int[] powers = new int[n];
        
        for (int i = 0; i < n; i++) {
            powers[i] = scanner.nextInt(); // Attack powers of the hammers
        }
        
        System.out.println(minHitsToBreakDoor(n, d, k, powers));
    }
    
    public static int minHitsToBreakDoor(int n, int d, int k, int[] powers) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int power : powers) {
            maxHeap.offer(power);
        }
        
        int hits = 0;
        
        while (d > 0 && hits < k) {
            if (maxHeap.isEmpty()) {
                return -1;
            }
            
            int currentPower = maxHeap.poll();
            hits++;
            
            d -= currentPower;
            if (d < 0) {
                d = 0; 
            }
            
            int newPower = currentPower / 2;
            if (newPower > 0) {
                maxHeap.offer(newPower);
            }
        }
        
        return d == 0 ? hits : -1;
    }
}
