using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Android.Settings.Opener.RNAndroidSettingsOpener
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAndroidSettingsOpenerModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAndroidSettingsOpenerModule"/>.
        /// </summary>
        internal RNAndroidSettingsOpenerModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAndroidSettingsOpener";
            }
        }
    }
}
