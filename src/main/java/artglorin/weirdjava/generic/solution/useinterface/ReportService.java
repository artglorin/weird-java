package artglorin.weirdjava.generic.solution.useinterface;

import java.util.List;

// tag::include[]
interface ReportService {

    String createReport(List<? extends Resource> resources);

}
// end::include[]
