package artglorin.weirdjava.generic.solution.useclass;

import java.util.List;

// tag::include[]
public interface ReportService {

    String createReport(List<? extends Resource> resources);

}
// end::include[]
