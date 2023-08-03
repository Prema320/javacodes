package com.sun;

public class ZooUtil extends Zoo{
 public static void run(Zoo zoo) {
	 Zoo zoo1=new Zoo();
	 if(zoo instanceof NationalZoo) {
		 Zoo natio=new NationalZoo();
		 natio.park();
		 NationalZoo natio1=(NationalZoo)natio;
		 natio1.learn();
	 }
	 if(zoo instanceof StateZoo) {
		 Zoo state=new StateZoo();
		 state.park();
		 StateZoo state1=(StateZoo)state;
		 state1.seeing();
	 }
 }

}
