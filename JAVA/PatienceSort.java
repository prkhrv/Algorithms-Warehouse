import java.util.ArrayList;

/**
 *
 * @author Akash Thakrar
 */
public class PatienceSort{
    public static void main(String args[]){
        ArrayList a = new ArrayList();
        int e[] = new int[] {14,10,6,7,5,13,9,12,2,8,4,3,11};
        a.add(new ArrayList());
        for(int i=0;i<e.length;i++){
            for(int j=0;j<a.size();j++){
                if(((ArrayList)a.get(j)).isEmpty()){
                    ((ArrayList)a.get(j)).add(e[i]);
                    a.add(new ArrayList());
                    break;
                }
                else{
                    if( (int)   (   (ArrayList)a.get(j)      ).get(  ((ArrayList)a.get(j)).size()-1    )   > e[i] ){
                        ((ArrayList)a.get(j)).add(e[i]);
                        break;
                    }
                }
            }
        }
        int min,temp,min_index=0;
        ArrayList ans = new ArrayList();
        while(ans.size()!=e.length){
            min = Integer.MAX_VALUE;
            for(int i=0;i<a.size();i++){
                if(!((ArrayList)a.get(i)).isEmpty()){
                    temp = (int)( (ArrayList)a.get(i) ).get( ((ArrayList)a.get(i)).size()-1 );
                    if(temp<min){
                        min = temp;
                        min_index = i;
                        
                    }
                }
            }
            ans.add(min);
            ((ArrayList)a.get(min_index)).remove( ((ArrayList)a.get(min_index)).size()-1 );
        }
        for(int i=0;i<ans.size();i++){
            System.out.println((int)ans.get(i));
        }
    }
}
