class binarysearch  {
  static int bs(int[] a,int x){
    for(int l=0,r=a.length-1;l<=r;){
      int m=(l+r)/2;
      if(a[m]==x) return m;
      if(a[m]<x) l=m+1; else r=m-1;
    }
    return -1;
  }
  public static void main(String[] s){
    System.out.println(bs(new int[]{2,4,6,8,10},8));
  }
}