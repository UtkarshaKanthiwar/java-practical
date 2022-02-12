package utkarsha;

 class EqualAndHashCodeMethod {
	 public String name;
	    public int id;
		public EqualAndHashCodeMethod(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		@Override
		public int hashCode() {
		return this.id;
		}
		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;
			if(obj == null || obj.getClass()!= this.getClass())
	            return false;
			EqualAndHashCodeMethod e = (EqualAndHashCodeMethod) obj;
			return(e.name == this.name && e.id == this.id);
		}
	    
}
