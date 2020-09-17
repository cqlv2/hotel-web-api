package dev.hotel.web.chambre;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.hotel.entite.Chambre;
import dev.hotel.entite.Client;
import dev.hotel.service.ChambreService;

@RestController
@RequestMapping("chambre")
public class ChambreController {

	
	private ChambreService roomServ;

	public ChambreController(ChambreService roomServ) {
		super();
		this.roomServ = roomServ;
	}
	
	
	@GetMapping
	public List<Chambre> ListClients() {
		return roomServ.readAll();

	}
	
	
	
}
