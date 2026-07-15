class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q =new LinkedList<>();
        Arrays.sort(deck);
        int n = deck.length;
        int[] a = new int[n];

        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        for(int c: deck){
            a[q.poll()]=c;
            if(!q.isEmpty())
            {
                q.offer(q.poll());
            }
        }
        return a;

    }
}