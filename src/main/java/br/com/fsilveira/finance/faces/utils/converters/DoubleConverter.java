package br.com.fsilveira.finance.faces.utils.converters;

import java.text.DecimalFormat;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@RequestScoped
@FacesConverter(value = "doubleConverter")
public class DoubleConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Double doubleValue = null;
		try {
			doubleValue = Double.parseDouble(value);
			return doubleValue;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public String getAsString(FacesContext context, UIComponent component, Object object) {
		if (object == null)
			return "";
		else {
			double valor = Double.parseDouble(object.toString());
			return new DecimalFormat("0.00").format(valor);
		}
	}

}
