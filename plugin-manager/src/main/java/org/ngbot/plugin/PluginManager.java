/*
 * ngBot (https://github.com/arixion/ngBot) is a free software to simulate various network protocol
 * Copyright (C) 2022-present.  Arpan Mukhopadhyay. All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.ngbot.plugin;

import org.ngbot.plugin.core.NoSuchPluginInstalledException;
import org.ngbot.plugin.core.PluginInstallationException;
import org.ngbot.plugin.core.PluginNotFoundException;

import java.util.List;

/**
 * PluginManager provides api to load custom plugin
 * to the application.
 *
 * @author Arpan Mukhopadhyay
 */
public interface PluginManager {

    /**
     * Loads a plugin to the system
     *
     * @param pluginId
     * @throws PluginNotFoundException
     * @throws PluginInstallationException
     */
    void install(String pluginId) throws PluginNotFoundException, PluginInstallationException;

    /**
     *
     * @param pluginId
     * @throws NoSuchPluginInstalledException
     */
    void uninstall(String pluginId) throws NoSuchPluginInstalledException;

    /**
     *
     * @param <T>
     * @return
     */
    <T extends Plugin> List<T> listInstalled();

    /**
     *
     * @param pluginId
     * @return
     * @throws PluginNotFoundException
     */
    boolean isInstallable(String pluginId) throws PluginNotFoundException;
}
