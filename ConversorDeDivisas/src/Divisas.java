import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record Divisas(String result,
                      @SerializedName("conversion_rates")
                      Map<String, Double> conversionRates) {
}
