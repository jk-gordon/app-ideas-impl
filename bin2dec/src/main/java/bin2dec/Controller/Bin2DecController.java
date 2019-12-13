package bin2dec.Controller;

import bin2dec.Service.Bin2DecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bin2DecController {

	private Bin2DecService bin2DecServiceService;

	@Autowired
	public Bin2DecController(Bin2DecService bin2DecServiceService) {
		this.bin2DecServiceService = bin2DecServiceService;
	}

	@RequestMapping("/")
	public Integer translate(@RequestParam String input) {

		// TODO add validation back in

		return bin2DecServiceService.translateBinary(input);
	}
}
