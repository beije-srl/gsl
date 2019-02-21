package it.beije.gsl.rest.model;

import it.beije.gsl.dao.model.StatConsulenti;

public class GetStatConsulentiRestResponse extends BaseGslServletRestResponse{
	
	private static final long serialVersionUID = 1L;
	
	private StatConsulenti statConsulenti;

	@Override
	public String toString() {
		return "GetStatConsulentiRestResponse [statConsulenti=" + statConsulenti + "]";
	}

	public StatConsulenti getStatConsulenti() {
		return statConsulenti;
	}

	public void setStatConsulenti(StatConsulenti statConsulenti) {
		this.statConsulenti = statConsulenti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((statConsulenti == null) ? 0 : statConsulenti.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetStatConsulentiRestResponse other = (GetStatConsulentiRestResponse) obj;
		if (statConsulenti == null) {
			if (other.statConsulenti != null)
				return false;
		} else if (!statConsulenti.equals(other.statConsulenti))
			return false;
		return true;
	}

}
