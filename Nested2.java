class OuterClass{
	public void outer1(){
		System.out.println("outer1");
		new NestedClass().nested2()
	}
	private void outer2(){
		System.out.println("outer2");
	}
	static class NestedClass
	{
		public  static void nested1(){
			System.out.println("nested1");
			outer2();
		}
		private void nested2(){
			System.out.println("nested2");
		}
	}
}

class MainClass{
	public static void main(String args[]){
		
		OuterClass.NestedClass nestObj = new OuterClass.NestedClass()
		
		nestObj.nested1();
		OuterClass.NestedClass.nested1();
	}
}

