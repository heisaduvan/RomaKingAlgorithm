import java.util.ArrayList;

public class RomaKingAlgorithm {
	
	public static void main(String args[]) 
    {
		ArrayList <Integer> killThis = new ArrayList <Integer>();
		
		for (int i=1; i<=21; i++) 
            
			killThis.add(i);
		
		method(killThis);
		
	}
	public static void method(ArrayList<Integer> arr ) {
		
			for (int i=0;i<arr.size();i+=3) {
				
				if(arr.size()%3 == 0) {
					
					arr.set(i+2,0);
					
				}
				
				else if (arr.size()%3 == 1 )
					
				{
					if(i+2<arr.size())
					{
						arr.set(i+2,0);
						arr.set(1, 0);
					}
					
				}
				
				else if (arr.size()%3 == 2 )
				{
					if(i+2 < arr.size()) {
						
						arr.set(i+2,0);
						arr.set(0, 0);
					}
				}
			}
			
			int size = arr.size();
			for (int i=0;i<size;i++) {
				
				if(i<arr.size()) {
					if (arr.get(i)==0) {
						arr.remove(i);
						i-=1;
					}
				}
				
			}
			if(arr.size()!=2)
			{
				method(arr);
			}
			else {
				System.out.println(arr);
			}
	}
}
