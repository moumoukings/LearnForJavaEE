package Prog;

public class Test {
	public static void main(String[] args) {
		//调用JavaEE对象
		JavaEE j = new JavaEE();
		
		j.setId("9527");
		j.setName("唐唐1");
		
		j.work();
		//调用Android对象
		Android a = new Android();
		
		a.setId("9528");
		a.setName("唐唐2");
		
		a.work();
		//调用Net对象
		Net_Gongchengshi n = new Net_Gongchengshi();
		
		n.setId("9529");
		n.setName("唐唐3");
		
		n.work();
		//调用Yingjian对象
		Yingjian_Gongchengshi y = new Yingjian_Gongchengshi();
		
		y.setId("9530");
		y.setName("唐唐4");
		
		y.work();
	}
}
