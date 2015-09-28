package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.Collections;

import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.rewriters.PBodyCopier;

public class ExtendedPBodyCopier extends PBodyCopier {

	/**
	 * Creates a new body instance with the given PQuery from the given body.
	 * @param body The copied body
	 * @param query The query instance, which will be used in the copied body
	 */
	public ExtendedPBodyCopier(PBody body, PQuery query) {
		super(query);
		
        // preinitialize parameter list
        this.body.setExportedParameters(Collections.<ExportedParameter>emptyList());

        // do the actual copying
        mergeBody(body);
	}

}
