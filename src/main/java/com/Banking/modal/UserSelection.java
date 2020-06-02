package com.Banking.modal;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="userselection")
	public class UserSelection {
		
		@Id
		private int id;
		//@Column(name="selection")
		private int selection;
		
		
		
		public UserSelection() {
			
		}
		
		
		public UserSelection(int selection) {
			super();
			this.selection = selection;
			
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getSelection() {
			return selection;
		}


		public void setSelection(int selection) {
			this.selection = selection;
		}


		@Override
		public String toString() {
			return "UserSelection [id=" + id + ", selection=" + selection + "]";
		}


		
		
		

	}
