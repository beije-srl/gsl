package it.beije.gsl.rest.model;

import it.beije.gsl.dao.model.Presentazione;

public class GetListaPresentazioniRestResponse extends BaseGslServletRestResponse {

		private static final long serialVersionUID = 1L;
		
		private Presentazione presentazione;

		public Presentazione getPresentazione() {
			return presentazione;
		}

		public void setPresentazione(Presentazione presentazione) {
			this.presentazione = presentazione;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((presentazione == null) ? 0 : presentazione.hashCode());
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
			GetListaPresentazioniRestResponse other = (GetListaPresentazioniRestResponse) obj;
			if (presentazione == null) {
				if (other.presentazione != null)
					return false;
			} else if (!presentazione.equals(other.presentazione))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "GetListaPresentazioniRestResponse [presentazione=" + presentazione + "]";
		}

		
		

}
