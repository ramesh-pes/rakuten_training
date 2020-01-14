package com.rakuten.prj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employes")
public class Employe {

		@Id
		@Column(name="emp_id",nullable = false)
		private int empID;
		
		private String email;
		private String fName;
		private String lName;
		/**
		 * @return the empID
		 */
		public int getEmpID() {
			return empID;
		}
		/**
		 * 
		 */
		public Employe() {
		}
		/**
		 * @param empID
		 * @param email
		 * @param fName
		 * @param lName
		 */
		public Employe(int empID, String email, String fName, String lName) {
			this.empID = empID;
			this.email = email;
			this.fName = fName;
			this.lName = lName;
		}
		/**
		 * @param empID the empID to set
		 */
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the fName
		 */
		public String getfName() {
			return fName;
		}
		/**
		 * @param fName the fName to set
		 */
		public void setfName(String fName) {
			this.fName = fName;
		}
		/**
		 * @return the lName
		 */
		public String getlName() {
			return lName;
		}
		/**
		 * @param lName the lName to set
		 */
		public void setlName(String lName) {
			this.lName = lName;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + empID;
			result = prime * result + ((fName == null) ? 0 : fName.hashCode());
			result = prime * result + ((lName == null) ? 0 : lName.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employe other = (Employe) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (empID != other.empID)
				return false;
			if (fName == null) {
				if (other.fName != null)
					return false;
			} else if (!fName.equals(other.fName))
				return false;
			if (lName == null) {
				if (other.lName != null)
					return false;
			} else if (!lName.equals(other.lName))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "empID=" + empID + ", email=" + email + ", fName=" + fName + ", lName=" + lName + "]";
		}
		
		
		
		
		
}
