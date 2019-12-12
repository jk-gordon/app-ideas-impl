package bin2dec.Controller;

import bin2dec.Service.Bin2DecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bin2DecController {

	private Bin2DecService bin2DecServiceService;

	@Autowired
	public Bin2DecController(Bin2DecService bin2DecServiceService) {
		this.bin2DecServiceService = bin2DecServiceService;
	}

	public void translate () {

		String input = bin2DecServiceService.getInput();

		bin2DecServiceService.validateInput(input);

		bin2DecServiceService.translateBinary(input);


	}
}
