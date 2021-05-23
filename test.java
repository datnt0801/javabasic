public class test {
    static class capso{
      int first;
      int last;
    };
    public static void main(String[] args) {
        int[] dayso = new int[]{1,2,3,4,0,5,6,7,8,0,9,10,11};
        capso c = chiso(dayso);
        System.out.println(c.first);
        System.out.println(c.last);
    }
    public static capso chiso(int[] a){
        capso b = new capso();
        for(int i = 0; i < a.length; i++){
            if(a[i]==0) b.first = i;
            break;
        }
        for(int i = a.length-1; i>=0; i--){
            if(a[i]==0) b.last = i;
        }
                return b;
    }
}
