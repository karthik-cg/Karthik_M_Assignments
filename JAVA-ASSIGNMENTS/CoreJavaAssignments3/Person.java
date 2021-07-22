package com.CoreJavaAssignments3;
import java.util.*;
public class Person implements Comparable<Person>{
	
		private Double weight;
		private Double height;
		private String name;

		public Person(Double weight, Double height, String name) {
			super();
			this.weight = weight;
			this.height = height;
			this.name = name;
		}

		public Double getWeight() {
			return weight;
		}

		public void setWeight(Double weight) {
			this.weight = weight;
		}

		public Double getHeight() {
			return height;
		}

		public void setHeight(Double height) {
			this.height = height;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

		@Override
		public int compareTo(Person o) {
			return this.getWeight().compareTo(o.getWeight());
		}
		
		

}