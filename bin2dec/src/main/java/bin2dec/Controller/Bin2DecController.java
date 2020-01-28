package bin2dec.Controller;

import bin2dec.Service.Bin2DecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

@RestController
@Validated
public class Bin2DecController {

	private Bin2DecService bin2DecService;

	@Autowired
	public Bin2DecController(Bin2DecService bin2DecService) {
		this.bin2DecService = bin2DecService;
	}

	@RequestMapping("/")
	public Integer translate(@RequestParam @Size(max=8, message = "Must enter a number with 8 characters or less") String input) {

		// TODO add validation on string characters

		return bin2DecService.translateBinary(input);
	}
}
