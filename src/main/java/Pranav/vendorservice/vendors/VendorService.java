package Pranav.vendorservice.vendors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> getAllVendors(){
		List<Vendor> vendors = new ArrayList<>();
		vendorRepository.findAll().forEach(vendors::add);
		return vendors;
	}
	public void addVendor(Vendor vendor) {
		vendorRepository.save(vendor);
	}
	public void removeVendor(int id) {
		vendorRepository.deleteById(id);
	}
	public Optional<Vendor> getVendor(int id)throws IllegalArgumentException {
		return vendorRepository.findById(id);

	}
//	public void updateVendor(int id, Vendor vendor) {
//		vendorRepository.save(vendor);
//	}
}
