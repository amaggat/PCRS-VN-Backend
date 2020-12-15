

import com.PcPartPicker.BackEnd.Drives.HardDriveDisk.HddRepository;
import org.springframework.stereotype.Controller;

@Controller
public class HddController {
    private final HddRepository hddRepository;

    public HddController(HddRepository hddRepository)
    {
        this.hddRepository = hddRepository;
    }
}
