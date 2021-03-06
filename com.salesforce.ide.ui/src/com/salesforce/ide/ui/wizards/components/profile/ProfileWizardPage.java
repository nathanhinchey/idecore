/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.wizards.components.profile;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.salesforce.ide.core.model.Component;
import com.salesforce.ide.ui.wizards.components.ComponentWizard;
import com.salesforce.ide.ui.wizards.components.generic.GenericComponentWizardPage;

public class ProfileWizardPage extends GenericComponentWizardPage {

    public ProfileWizardPage(ComponentWizard componentWizard) {
        super(componentWizard);
    }

    @Override
    public String getComponentName() {
        return componentWizardComposite.getComponentName();
    }

    @Override
    public void createComposite(Composite parent) {
        Component component = componentWizard.getComponentController().getComponent();
        componentWizardComposite = new ProfileWizardComposite(parent, SWT.NULL, component.getDisplayName());
        componentWizardComposite.setComponentWizardPage(this);
    }

    public ProfileWizardComposite getProfileWizardComposite() {
        return (ProfileWizardComposite) componentWizardComposite;
    }

    public ProfileWizard getProfileWizard() {
        return (ProfileWizard) componentWizard;
    }

    @Override
    public void saveUserInput() throws InstantiationException, IllegalAccessException {
        if (componentWizardComposite == null) {
            throw new IllegalArgumentException("Component composite cannot be null");
        }

        // nothing saved to metadata instance at this time

        /*ProfileWizardComposite profileWizardComposite = (ProfileWizardComposite) componentWizardComposite;
        ProfileWizardModel profileWizardModel = (ProfileWizardModel) componentWizard.getComponentWizardModel();
        Component component = profileWizardModel.getComponent();

        // create metadata instance and save metadata input values
        com.salesforce.ide.api.metadata.types.Profile profile =
                (com.salesforce.ide.api.metadata.types.Profile) component.getDefaultMetadataExtInstance();

        if (logger.isDebugEnabled()) {
            logger.debug("Created and loaded instance of '" + profile.getClass().getName() + "' with user input");
        }*/
    }
}
