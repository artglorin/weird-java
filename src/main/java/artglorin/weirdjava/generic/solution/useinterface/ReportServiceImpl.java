package artglorin.weirdjava.generic.solution.useinterface;

import java.util.List;

class ReportServiceImpl implements ReportService {
    @Override
    public String createReport(List<? extends Resource> resources) {
        return "";
    }
}
