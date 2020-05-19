package ch.akratash.m226b.lb1.coronaprovider;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoronadataController {

	// adapted from https://spring.io/guides/gs/rest-service/#scratch

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/coronadata")
	public Coronadata coronadata(@RequestParam(value = "date", defaultValue = "2020-05-08") String date) {
		List<CoronaRow> rows = CoronaCsvReader.loadCsv();
		String confirmed = "";
		String deceased = "";
		String tested = "";
		for(CoronaRow row : rows){
			if(row.getDate().equals(date)){
				tested = Integer.toString(row.getNcumul_tested());
				confirmed = Integer.toString(row.getNcumul_conf());
				deceased = Integer.toString(row.getNcumul_deceased());

			}
		}

		return new Coronadata(counter.incrementAndGet(), date, tested, confirmed, deceased);
	}
}